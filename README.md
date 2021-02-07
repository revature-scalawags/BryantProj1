Project1

Project Description:
  Reads in a wiki TSV file with the wiki page's name and number of views and then uses MapReduce to count the number of views 
  each page recieved. 

Technologies Used:
  Scala - Version 2.14.4
  Apache Hadoop - Version 1.4.6
  SBT - Version 0.15.0

Features:
  Reads in wikipedia TSV file from HDFS
  Returns data set with wiki page name and the number of views

To-do list:
  Run MapReduce again to get the data set in order from most views to least

Getting Started:
  Requirements:
    Java JDK 8, SBT, Scala, Hadoop cluster (docker was used for Hadoop cluster)
    Download project with: git clone https://github.com/revature-scalawags/BryantProj1
  Hadoop Commands:
    Format filesystem: $ bin/hdfs namenode -format
    Start NameNode and DataNode daemon: $ sbin/start-dfs.sh
    Browse local hose to find NameNode: NameNode - http://localhost:9870/ (or docker ps to see nameNode)
    Make the HDFS directories required to execute MapReduce jobs:
       $ bin/hdfs dfs -mkdir /user
       $ bin/hdfs dfs -mkdir /user/<username>
    Copy the input files into the distributed filesystem:
       $ bin/hdfs dfs -mkdir input
       $ bin/hdfs dfs -put etc/hadoop/*.xml input
Usage:
  In terminal navigate to directory containing project and type: sbt "run [input dir] [output dir]"
    [input dir] = your input file (wiki tsv file)
    [output dir] = output file (location where you want to save calulations after MapReduce)



