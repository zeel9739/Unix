echo -e "Enter the String : \c"
read input
reverse=""
len=${#input}
#for loop is awk command
for (( i=$len-1; i>=0; i-- ))
do
	reverse="$reverse${input:$i:1}"
done
if [ $input == $reverse ]
then
	echo "$input is palindrome"
else
	echo "$input is not palindrome"
fi
