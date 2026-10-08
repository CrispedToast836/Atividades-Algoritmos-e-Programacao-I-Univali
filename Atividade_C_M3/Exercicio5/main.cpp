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
    int vetor[7];
    
    cout << "=== Vetor Invertido ===" << endl;
    cout << "Por favor, digite 7 números inteiros." << endl;
    cout << "------------------------------------" << endl;
    
    
    for (int i = 0; i < 7; i++) {
        cout << "Digite o " << i + 1 << "º número: " << endl;
        cin >> vetor[i];
    }
    
    cout << "------------------------------------" << endl;
    cout << "Exibindo o vetor na ordem inversa:" << endl;
    
    
    for (int i = 6; i >= 0; i--) {
        cout << vetor[i] << " ";
    }
    
    cout << endl;

    return 0;
}









