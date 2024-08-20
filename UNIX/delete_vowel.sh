echo -e "Enter String :\c"
read str
echo "Old String is : $str"
#remove vovels
newstr=$(echo $str | sed 's/[aeiouAEIOU]//g')
echo "New String is : $newstr"
