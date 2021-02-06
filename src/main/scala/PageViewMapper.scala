import org.apache.hadoop.mapreduce.Mapper
import org.apache.hadoop.io.LongWritable
import org.apache.hadoop.io.IntWritable
import org.apache.hadoop.io.Text

class PageViewMapper extends Mapper[LongWritable, Text, Text, IntWritable]{
    override def map(
        key: LongWritable,
        value: Text,
        context: Mapper[LongWritable, Text, Text, IntWritable]#Context
    ): Unit = {

        //
        //Code to split your data here 
        //
        val line = value.toString
        val pageTitle:Text = new Text()
        val pageViews:IntWritable = new IntWritable

        val searchLine = line.split(" ")
        
        pageTitle.set(searchLine(1))
        pageViews.set(searchLine(2).toInt)
        
        context.write(pageTitle, pageViews)
    }
}