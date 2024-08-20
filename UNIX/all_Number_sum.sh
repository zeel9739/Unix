i=1
no1=0
while [ $i -ne 0 ]
do
 echo -e "Enter the No. : \c"
 read no
 if test $no -ne 0
 then
	no1=$(($no1+$no))
	echo "Sum : $no1"
 else
	exit
 fi
 i=`expr $i + 1`
done
