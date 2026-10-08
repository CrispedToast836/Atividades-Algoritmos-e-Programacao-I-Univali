/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;

int main()
{
    int escolha;
    double num1, num2, resultado;
    
    
    cout << "=== Calculadora ===" << endl;
    cout << "1 - Soma" << endl;
    cout << "2 - Subtração" << endl;
    cout << "3 - Multiplicação" << endl;
    cout << "4 - Divisão" << endl;
    cout << "5 - Sair" << endl;
    
    cin >> escolha;
    
    switch (escolha) {
        case 1:
            cout << "Qual seu primeiro número?" << endl;
            cin >> num1;
            cout << "Qual número você quer somar?" << endl;
            cin >> num2;
            
            resultado = num1 + num2;
            
            cout << num1 << " + " << num2 << " = " << resultado;
            break;
        case 2:
            cout << "Qual seu primeiro número?" << endl;
            cin >> num1;
            cout << "Qual número você quer subtrair?" << endl;
            cin >> num2;
            
            resultado = num1 - num2;
            
            cout << num1 << " - " << num2 << " = " << resultado;
            break;
        case 3:
            cout << "Qual seu primeiro número?" << endl;
            cin >> num1;
            cout << "Qual número você quer multiplicar?" << endl;
            cin >> num2;
            
            resultado = num1 * num2;
            
            cout << num1 << " X " << num2 << " = " << resultado;
            break;
        case 4:
            cout << "Qual seu primeiro número?" << endl;
            cin >> num1;
            cout << "Qual número você quer dividir?" << endl;
            cin >> num2;
            
            if (num2 == 0){
                cout << "Não é possível dividir por 0!!!" << endl;
                break;
            }
            
            resultado = num1 / num2;
            
            cout << num1 << " / " << num2 << " = " << resultado;
            break;
        case 5:
            cout << "Encerrando programa!" << endl;
            break;
        default:
            cout << "Opção inválida" << endl;
            break;
        
        
        
    }

    return 0;
}














