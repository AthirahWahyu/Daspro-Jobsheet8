# JOBSHEET 8

# PERCOBAAN 

## - Percobaan 1 : Review Perulangan 1

## - Percobaan 1 : Verifikasi Hasil Percobaan

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Jika pada perulangan for, inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya?
Mengapa bisa demikian? 
2.  Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? 
Mengapa bisa demikian? 
3.  Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya?
Mengapa bisa demikian? 

_Jawaban:_

1.  Akibatnya   : Jumlah bintang bertambah satu.
    Alasannya   : Karena indeks perulangan dimulai dari 0, bukan 1, maka kondisi i <= N membuat loop berjalan satu kali lebih banyak.

    Contoh : Jika N = 5,
    - Dengan i = 1, Output : ***** (5 bintang)
    - Dengan i = 0, Output : ****** (6 bintang)
2.  Akibatnya   : Tidak ada bintang yang tercetak.
    Alasanya    : Kondisi i > N tidak pernah benar untuk nilai awal i = 1 dan N lebih besar darinya.
    Jadi, loop tidak dijalankan sama sekali.
3.  Akibatnya   : Terjadi perulangan tak terbatas (infinite loop).
    Alasannya   : Karena i-- membuat nilai i terus menurun, sehingga kondisi i <= N selalu benar dan loop tidak pernah selesai.

## - Percobaan 2 : Bintang Persegi

## - Percobaan 2 : Verifikasi Hasil Percobaan

![Verifikasi2](./Verifikasi2.png)








 
