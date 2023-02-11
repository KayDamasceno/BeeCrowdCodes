import binascii

n = int(input())

text = input().split()

text = ''.join(text)

print(''.join(chr(int(text[i:i+2], 16)) for i in range(0, len(text), 2)))
