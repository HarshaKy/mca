str1 = input("Enter anything m8: ")
newStr = ""

for i in str1: 
	if i.isalpha():
		newStr = newStr + i

if newStr.lower() == newStr[::-1].lower():
	print("it's a palindrome m8")
else:
	print("not a palindrome m8")