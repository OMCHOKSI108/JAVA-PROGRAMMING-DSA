#include <iostream>
#include <vector>
#include <cmath>
#include <chrono>

using namespace std;

int main() {
    const int size = 100009600; // Adjust this value for more complexity
    vector<double> vec(size);
    auto start = chrono::high_resolution_clock::now();

    // Perform heavy computations
    for (int i = 0; i < size; ++i) {
        vec[i] = (sin(i) * cos(i) * sqrt(i))/(sin(i+2) * cos(i+3) * sqrt(i+4));
    }

    auto end = chrono::high_resolution_clock::now();
    chrono::duration<double> duration = end - start;
    cout << "Computation done in: " << duration.count() << " seconds" << endl;

    return 0;
}
