echo -e "Enter a Number : \c"
read no
no1=$no
f=1
while [ $no -gt 1 ]
do
 f=$((f * no))
 no=$((no - 1))
done
echo "$f Is Factorial Of $no1"