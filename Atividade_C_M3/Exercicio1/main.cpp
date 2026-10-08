/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cmath>
using namespace std;


int main()
{
    double peso, altura, IMC;
    
    
    cout << "Qual seu peso?" << endl;
    cin >> peso;
    cout << "Qual sua altura? Ex: 1.80" << endl;
    cin >> altura;

    IMC = peso / std::pow(altura, 2);
    cout << "Seu IMC é: " << IMC << endl;

    
    if (IMC < 16) {
        cout << "Classificação: magreza grave" << endl;
    }
    else if (IMC >= 16 && IMC < 17) {
        cout << "Classificação: magreza moderada" << endl;
    }
    else if (IMC >= 17 && IMC < 18.5) {
        cout << "Classificação: magreza leve" << endl;
    }
    else if (IMC >= 18.5 && IMC < 25) {
        cout << "Classificação: saudável" << endl;
    }
    else if (IMC >= 25 && IMC < 30) {
        cout << "Classificação: sobrepeso" << endl;
    }
    else if (IMC >= 30 && IMC < 35) {
        cout << "Classificação: obesidade grau I" << endl;
    }
    else if (IMC >= 35 && IMC < 40) {
        cout << "Classificação: obesidade grau II" << endl;
    }
    else { 
        cout << "Classificação: obesidade grau III" << endl;
    }
    

    return 0;
}
    