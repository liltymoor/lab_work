from spec_print import spec_print
from namespace_gc import GC


A = int(input("Введите A: "))
B = input("Введите B: ")

gc = GC(locals())
gc.do_snapshot()

#
# Task №1
#

BYTE_PART = "0011"
BCD, ASCII = "", ""

digit_counter = 0

for digit in str(A):
    binary_digit = bin(int(digit))[2:]
    binary_digit = (4 - len(binary_digit)) * '0' + binary_digit

    ASCII += " " + BYTE_PART + " " + binary_digit
    BCD += " " + binary_digit

if len(str(A)) % 2 != 0:
    BCD = "0000" + BCD

spec_print(1, {0: "BCD", 1: "ASCII"}, BCD, ASCII)

gc.clear()

#
# Task №2
#

binary = bin(A)[2:]
format_unsign = (16 - len(binary)) * '0' + binary
format_sign = ""

flag = True
for bit_num in reversed(range(len(format_unsign))):
    if format_unsign[bit_num] == "0" and flag:
        format_sign = "0" + format_sign
        continue
    elif format_unsign[bit_num] == "1" and flag:
        format_sign = "1" + format_sign
        flag = False
        continue

    if bit_num == 15:
        format_sign = "1" + format_sign
        break

    if format_unsign[bit_num] == "0":
        format_sign = "1" + format_sign
    else:
        format_sign = "0" + format_sign

spec_print(2, {0: "Положительное", 1: "Отрицательное"}, format_unsign, format_sign)
gc.clear()

#
# Task №3
#


