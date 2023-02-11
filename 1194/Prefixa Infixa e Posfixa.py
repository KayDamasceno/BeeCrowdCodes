#!/usr/bin/env python
from __future__ import division, print_function
import math
import os
import sys
from io import BytesIO, IOBase
from sys import stdin, stdout 
import threading
import re

if sys.version_info[0] < 3:
    from __builtin__ import xrange as range
    from future_builtins import ascii, filter, hex, map, oct, zip
    
def dmain():
    sys.setrecursionlimit(1000000)
    threading.stack_size(1024000)
    thread = threading.Thread(target=main)


class Node:
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None

#print the height of binary Tree
def insert(root, key): 
    if root is None: 
        return Node(key) 
    else: 
        if root.data == key: 
            return root 
        elif root.data < key: 
            root.right = insert(root.right, key) 
        else: 
            root.left = insert(root.left, key) 
    return root 

def printLevelOrder(root):
    
    #Não tem arvore
    if root is None:
        return

    #Criando uuma fila vazia

    queue = []

    # Adiciona a raiz

    queue.append(root)
    toPrint= []
    while len(queue) > 0:

        toPrint.append(str(queue[0].data))
        node = queue.pop(0)

        if node.left is not None:
            queue.append(node.left)

        if node.right is not None:
            queue.append(node.right)    

    print(' '.join(toPrint))

def search(arr, x, n):
      
    for i in range(n):
        if (arr[i] == x):
            return i
 
    return -1
def printPostOrder2(In, pre, n):
     
    # The first element in pre[] is always 
    # root, search it in in[] to find left 
    # and right subtrees
    root = search(In, pre[0], n)
 
    # If left subtree is not empty, 
    # print left subtree
    if (root != 0):
        printPostOrder2(In, pre[1:n], root)
 
    # If right subtree is not empty, 
    # print right subtree
    if (root != n - 1):
        printPostOrder2(In[root + 1 : n], 
                      pre[root + 1 : n],
                      n - root - 1)
 
    # Print root
    print(pre[0], end = "")
toPrint = []
def printInorder(root): 
    
    if root: 
  
        # First recur on left child 
        printInorder(root.left) 
  
        # then print the data of node 
        toPrint.append(str(root.data))
  
        # now recur on right child 
        printInorder(root.right) 
  
  
  
# A function to do postorder tree traversal 
def printPostorder(root): 
  
    if root: 
  
        # First recur on left child 
        printPostorder(root.left) 
  
        # the recur on right child 
        printPostorder(root.right) 
  
        # now print the data of node 
        toPrint.append(str(root.data))
  
  
# A function to do preorder tree traversal 
def printPreorder(root): 
  
    if root: 
  
        # First print the data of node 
        toPrint.append(str(root.data))
  
        # Then recur on left child 
        printPreorder(root.left) 
  
        # Finally recur on right child 
        printPreorder(root.right) 
  
def main():
    global toPrint
    
    cases = int(input())
    
    while cases!=0:

        size, pre, ino = input().split()

        pre = list(pre)
        ino = list(ino)

        printPostOrder2(ino, pre, int(size))
        print("")

        cases-=1

        

       
# region fastio

BUFSIZE = 8192


class FastIO(IOBase):
    newlines = 0

    def __init__(self, file):
        self._fd = file.fileno()
        self.buffer = BytesIO()
        self.writable = "x" in file.mode or "r" not in file.mode
        self.write = self.buffer.write if self.writable else None

    def read(self):
        while True:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))
            if not b:
                break
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines = 0
        return self.buffer.read()

    def readline(self):
        while self.newlines == 0:
            b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))
            self.newlines = b.count(b"\n") + (not b)
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines -= 1
        return self.buffer.readline()

    def flush(self):
        if self.writable:
            os.write(self._fd, self.buffer.getvalue())
            self.buffer.truncate(0), self.buffer.seek(0)


class IOWrapper(IOBase):
    def __init__(self, file):
        self.buffer = FastIO(file)
        self.flush = self.buffer.flush
        self.writable = self.buffer.writable
        self.write = lambda s: self.buffer.write(s.encode("ascii"))
        self.read = lambda: self.buffer.read().decode("ascii")
        self.readline = lambda: self.buffer.readline().decode("ascii")


def print(*args, **kwargs):
    #Prints the values to a stream, or to sys.stdout by default.
    sep, file = kwargs.pop("sep", " "), kwargs.pop("file", sys.stdout)
    at_start = True
    for x in args:
        if not at_start:
            file.write(sep)
        file.write(str(x))
        at_start = False
    file.write(kwargs.pop("end", "\n"))
    if kwargs.pop("flush", False):
        file.flush()


if sys.version_info[0] < 3:
    sys.stdin, sys.stdout = FastIO(sys.stdin), FastIO(sys.stdout)
else:
    sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)

input = lambda: sys.stdin.readline().rstrip("\r\n")

# endregion

if __name__ == "__main__":
    main()
   #dmain()
