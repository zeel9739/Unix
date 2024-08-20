echo -e "Enter the Name : \c"
read name
echo -e "Enter the Sub1 Marks : \c"
read s1
echo -e "Enter the Sub2 Marks : \c"
read s2
echo -e "Enter the Sub3 Marks : \c"
read s3

echo "Name : $name"
echo "Sub1 : $s1"
echo "Sub2 : $s2"
echo "Sub3 : $s3"

if test $s1 -lt 0 -o $s2 -lt 0 -o $s3 -lt 0 -o $s1 -gt 100 -o $s2 -gt 100 -o $s3 -gt 100
then
	echo "Enter the Valid Marks"
else
	total=$(($s1+$s2+$s3))
	echo "Total Marks : $total"
 
	per=$(($total/3))
	echo "Percentage : $per"
 
	if test $s1 -lt 35 -o $s2 -lt 35 -o $s3 -lt 35
	then
		echo "Fail"
	else
		if test $per -ge 90 -a $per -lt 100
		then
			echo "Distinction"
		elif test $per -ge 80 -a $per -lt 90
		then
			echo "First Class With Distinction"
		elif test $per -ge 70 -a $per -lt 80
		then
			echo "First Class"
		elif test $per -ge 60 -a $per -lt 70
		then
			echo "Second Class"
		elif test $per -ge 50 -a $per -lt 60
		then
			echo "Third Class"
		elif test $per -ge 35 -a $per -lt 50
		then
			echo "Pass"
		else
			echo "Fail"
		fi
	fi
fi