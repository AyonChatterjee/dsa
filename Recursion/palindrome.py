def check_palindrome(s):

    for i in range(0 , len(s) // 2):
        if s[i] != s[len(s) - i - 1]:
            return False
        

    return True


if __name__ == "__main__" :
    s = "123221"
    if(check_palindrome(s) == True):
        print("This is a palindrome number")
    else:
        print("This is not a palindrome number")