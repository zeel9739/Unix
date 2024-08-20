echo -e "Enter the No : \c"
read no
i=1
while [ $i -le $no ]
do
 echo "$i"
#Interval of 1 second
 sleep 1
 i=`expr $i + 1`
done
