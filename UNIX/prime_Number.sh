echo -e "Enter the No : \c"
read no
i=2
c=0
while test $i -le `expr $no / 2`
do
 if test `expr $no % $i` -eq 0
 then
	c=1
 fi
 i=`expr $i + 1`
done
if test $c -eq 0
then
	echo "$no is Prime Number"
else
	echo "$no is Not Prime Number"
fi
