Welcome to StackEdit!
===================


Hey! I'm your first Markdown document in **StackEdit**[^stackedit]. Don't delete me, I'm very helpful! I can be recovered anyway in the **Utils** tab of the <i class="icon-cog"></i> **Settings** dialog.
**자바 의 정석**


----------

* 한글 입력 잘되나 확인중 

* python 
# -*- coding: utf-8 -*-

from sys import exit

pay = int(input("투입할 금액을 입력하세요: "))
price = int(input("제품의 가격을 입력하세요: "))
number = int(input("제품의 갯수를 입력하세요: "))
coin = int(input("동전의 단위를 입력하세요: "))
coin_list = [500, 100, coin]
coin_list.sort(reverse=True)

if pay >= price * number:
    back = pay - price * number
else:
    print("투입된 금액이 부족합니다.")
    exit()

for i in range(3):
    if back != 0:
        share = int(back / coin_list[i])
        back = back - coin_list[i] * share
        print(coin_list[i], "원", share, "개")

five = int(back / coin)
one = int((back % coin) / 100)
print("반환:", str(back) + "원")
print("오백원:", str(five) + "개", "백원:", str(one) + "개")
