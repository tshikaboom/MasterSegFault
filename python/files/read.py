def open_file(path, mode):
    return open(path, mode)

def read_line(f):
    return f.readline()

def read_all(f):
    return f.read()

def read_for(f):
    res = ""
    for line in f:
        res+= line

    return res


