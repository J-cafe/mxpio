#export JAVA_HOME=/usr/java/default
#export PATH=$JAVA_HOME/bin:$PATH
#export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

Port=80
JarName=blog-1.6.3.jar
LogsPatch=./logs_$Port


#ID=`ps -ef | grep $Port | grep -v "grep" | awk '{print $2}'`
ID=`ps -ef | grep "$JarName" |grep -v "grep" | awk '{print $2}'`
echo $ID  
echo "---------------"  
for id in $ID  
do  
kill -s 9 $id  
echo "killed $id"  
done  
echo "---------------"  

rm -rf $LogsPatch
mkdir $LogsPatch

export LANG=zh_CN.UTF-8

set -m 

nohup java -jar -Dlogging.path=$LogsPatch  $JarName>$LogsPatch/catlina.out 2>&1 &

tail -f $LogsPatch/catlina.out

