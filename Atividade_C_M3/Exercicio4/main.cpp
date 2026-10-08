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
    int quantidade, posicao;
    double nota, soma, media;
    
    soma = 0;
    quantidade = 0;
    
    posicao = 1;
    
    cout << "=== Calculadora de Média ===" << endl;
    cout << "Digite as notas uma por uma." << endl;
    cout << "Quando terminar, digite -1 para calcular a média." << endl;
    cout << "------------------------------------" << endl;
    
    cout << "Digite a " <<  posicao << "ª nota " << endl;
    cin >> nota;
    
    
    while (nota != -1) {
        soma = soma + nota;           
        quantidade++;  
        posicao++;
        
        cout << "Digite a "<< posicao <<"ª nota (ou -1 para encerrar): " << endl;
        cin >> nota;
    }
    
    
    if (quantidade == 0) {
        cout << "Nenhuma nota foi digitada!!!" << endl;
    } 
    else {
        media = soma / quantidade;
        cout << "------------------------------------" << endl;
        cout << "Voce digitou " << quantidade << " notas." << endl;
        cout << "A média final e: " << media << endl;
    }

    return 0;
}