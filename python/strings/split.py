def splitString(input_str, delim):
    return input_str.split(delim)


test = "toto:totot:totot:toto"

res = splitString(test, ":")

print("splited: ", res)
