
word = input()
def solve(word):
    upperCount, lowerCount = 0, 0
    for i in word:
        if(i.isupper()):
            upperCount = upperCount + 1
        elif(i.islower()):
            lowerCount = lowerCount + 1
    
    if(upperCount == lowerCount):
       word = word.lower()
    elif(upperCount > lowerCount):
       word = word.upper()
    elif(upperCount < lowerCount):
       word = word.lower()
    return word

print(solve(word))