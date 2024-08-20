no=$#
if test $no -eq 0
then
	echo "No Command Line Arguments"
else
#command line index
n1=$1
#command line index
n2=$2
#command line index
n3=$3
if test $n1 -eq $n2 -a $n2 -eq $n3
then
	echo "All the three numbers are equal"
elif test $n1 -eq $n2 -a $n1 -gt $n3 -a $n2 -gt $n3
then
	echo "$n1 and $n2 are equal and max"
elif test $n1 -eq $n3 -a $n1 -gt $n2 -a $n3 -gt $n2
then
	echo "$n1 and $n3 are equal and max"
elif test $n2 -eq $n3 -a $n2 -gt $n1 -a $n3 -gt $n1
then
	echo "$n2 and $n3 are equal and max"
elif test $n1 -gt $n2 -a $n1 -gt $n3
then
	echo "$n1 is max number"
elif test $n2 -gt $n1 -a $n2 -gt $n3
then
	echo "$n2 is max number"
else
	echo "$n3 is max number"
 fi
fi