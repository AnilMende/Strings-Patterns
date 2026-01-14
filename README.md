Pattern 1 : Two Pointer Approach ::
Compare Characters from both ends and move inward until the condition fails.

=> Reverse a String:
Keep pointers i and j at the 0 and s.length() - 1.
Perfom the swapping of the characters. Strings are immutable so convert the string into the
Character Array using s.toCharArray() , perform the same operation untill the i <= j.

=> Valid Palindrome:
Palindrome is a string from the start and end it will be read as same.
if the string contains uppercase letters, digits from 0 to 9 and symbols use
s.toLowerCase().replaceAll("[^a-z0-9]",""), this converts the string to lowercase and removes non-alphabetic characters,
replaces those characeters with an empty string ("").
Only compare the Characters at i and Character at j if they are different return false(not a palindrome),
else increment i and decrement j. Perform the Same Operation until i <= j.
