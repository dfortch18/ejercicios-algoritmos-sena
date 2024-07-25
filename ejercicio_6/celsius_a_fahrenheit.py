def main():
    try:
        celsius = float(input("Digite la temperatura en grados Celsius (C°): "))
        
        fahrenheit = (9 / 5) * celsius + 32
        
        print(f"La cantidad en grados Fahrenheit (F) es: {fahrenheit}")
    except ValueError:
        print("Número invalido")

if __name__ == '__main__':
    main()
