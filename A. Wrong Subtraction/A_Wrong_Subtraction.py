
numbertime = input()
data = numbertime.split(" ", 2)

def wrong_subtraction(number, time):
    for i in range(time):
        lastDigit = number % 10
        if(lastDigit != 0):
            number = number - 1
        elif(lastDigit == 0):
            number = number / 10
    
    return int(number)

totalTime = wrong_subtraction(int(data[0]), int(data[1]))
print(totalTime)