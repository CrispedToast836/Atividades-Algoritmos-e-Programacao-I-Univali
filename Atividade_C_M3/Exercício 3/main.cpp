/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cstdlib> 
#include <ctime>
using namespace std;

int main()
{
    int num, palpite, tentativas;
    
    srand(time(0));
    
    
    
    num = rand() % 100 + 1;
    tentativas = 0;
    
    cout << "=== Jogo da Adivinhação ===" << endl;
    cout << "Pensei em um número entre 1 e 100. Tente adivinhar!" << endl;
    
    
    while (palpite != num) {
        cout << "Qual o seu palpite?" << endl;
        cin >> palpite;
        tentativas = tentativas + 1; 
        
        if (palpite < num) {
            cout << "O número secreto é maior que " << palpite << "!" << endl;
            cout << "------------------------------------" << endl;
        }
        else if (palpite > num) {
            cout << "O número secreto é menor que " << palpite << "!" << endl;
            cout << "------------------------------------" << endl;
        }
        else {
            cout << "Parabéns! Você acertou o número!" << endl;
            cout << "O número era " << num << " e você precisou de " << tentativas << " tentativas." << endl;
        }
        
    } 

    return 0;
}















