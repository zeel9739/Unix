echo -e "Enter Pattern :\c"
read p
echo -e "Enter File Name :\c"
read f
echo "Your Search Pattern Is :$p"
#match the pattern in list file
ls=$(grep -i $p $f)
if test $p != $ls
then
 echo "Pattern Is Not Match In List"
else
 echo "Pattern Match In List : $p"
fi