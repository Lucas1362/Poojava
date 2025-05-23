numeroPorcentagem = float(input("digite a porcentagem que voce deseja: "))
conversaoPorcentagem = float(numeroPorcentagem / 100)
numeroTotal = float(input("digite o valor total que deseja obter a porcentagem: "))

while conversaoPorcentagem > 1:
    print("porcentagem invalida, tente novamente")
    numeroPorcentagem = float(input("digite a porcentagem que voce deseja: "))
    conversaoPorcentagem = numeroPorcentagem / 100

calculoPorcentagem = float(numeroTotal * conversaoPorcentagem)

print(f"O valor obtido a partir da porcentagem {numeroPorcentagem}% do numero {numeroTotal} é : ", calculoPorcentagem)