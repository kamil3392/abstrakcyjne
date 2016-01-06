package zadwlasne;

public class QuickSort {

    public long tab[];
    public int ilosc_liczb;

    public QuickSort(int ilosc_liczb, long tab[]) {
        this.ilosc_liczb = ilosc_liczb;
        this.tab = new long[ilosc_liczb];
        System.arraycopy(tab, 0, this.tab, 0, ilosc_liczb);

        if (czy_posortowana() == false) {
            quicksort(0, ilosc_liczb - 1);
        }

    }

    boolean czy_posortowana() {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                return false;
            }
        }
        return true;
    }

    void swap(int i, int j) { // zamiana
        long temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    long medianOf3(int L, int P) {
        int SR = (L + P) / 2;

        if (tab[L] > tab[SR]) {
            swap(L, SR);
        }

        if (tab[L] > tab[P]) {
            swap(L, P);
        }

        if (tab[SR] > tab[P]) {
            swap(SR, P);
        }

        return tab[P];

    }

    int Partition(int L, int P) {

        long q = 0;
        q = medianOf3(L, P);
        int I = L - 1;
        int J = P;
        while (true) {
            while (tab[++I] < q);
            while (tab[--J] > q);
            if (I >= J) {
                break;
            } else {
                swap(I, J);
            }
        }

        swap(I, P);
        return I;
    }

    void quicksort(int L, int P) {
        int q;
        while (P - L > 5 || L < tab.length) {
            if (P - L > 5) {

                q = Partition(L, P);

                tab[P] = tab[P] * (-1);
                P = q - 1;
            } else {
                L = P + 2;
                if (L < ilosc_liczb) {
                    P = Znajdz(L);
                } else if (tab[ilosc_liczb - 1] < 0) {
                    tab[ilosc_liczb - 1] = tab[ilosc_liczb - 1] * (-1);
                }
            }
        }

        insertion_sort();

    }

    int Znajdz(int L) {
        int i;
        for (i = L; i < ilosc_liczb; i++) {
            if (tab[i] < 0) {
                tab[i] = tab[i] * (-1);
                return i;
            }
        }
        return i - 1;
    }

    void insertion_sort() {
        long klucz;
        int j;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                tab[i] = tab[i] * (-1);
            }
            j = i;
            klucz = tab[i];
            while (j > 0 && tab[j - 1] > klucz) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = klucz;
        }
    }

    public void wypiszElementy() {
        for (int i = 0; i < ilosc_liczb; i++) {
            System.out.println(tab[i]);
        }
    }

}
