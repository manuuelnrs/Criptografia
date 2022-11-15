'''
>	@author Juan Manuel Nava Rosales
>	@date 14/Noviembre/2022
>	@brief Kid Krypto Algorithm - Cryptography - Practice Session 5
>	@version 1.0 
'''
def keys(a, b, A, B):
  M = a * b - 1
  d = B * M + b         # Private Key
  e = A * M + a         # Public Key pair
  n = (e * d - 1) / M   # Public Key pair
  return d, e, n

# Algoritmo Criptográfico Kid Krypto
def KID_KRYPTO( x, e, n ):
  xe = int(x) * e
  ciphertext = str(int(xe % n))
  return ciphertext

# Decrypt
def DEC_KID_KRYPTO( y, d, n ):
  yd = int(y) * d
  plaintext = str(int(yd % n))
  return plaintext

##################      MAIN PROGRAM      ##################
def main():
  print("\tKid Krypto Algorithm - Practical Session 5 - 419048901")

  # Vector Test 1
  print("TEST_VECTOR(1) =======================")
  plainText = "200"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(3, 4, 5, 6)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  # Vector Test 2
  print("TEST_VECTOR(2) =======================")
  plainText = "650"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(3, 4, 5, 6)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  # Vector Test 3
  print("TEST_VECTOR(3) =======================")
  plainText = "1028"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(9, 11, 5, 8)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  # Vector Test 4
  print("TEST_VECTOR(4) =======================")
  plainText = "54"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(9, 11, 5, 8)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  # Vector Test 5
  print("TEST_VECTOR(5) =======================")
  plainText = "12223"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(47, 22, 11, 5)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  # Vector Test 6
  print("TEST_VECTOR(6) =======================")
  plainText = "4356"     # PlainText | 4 Random Integers
  private_key, public_key, public_key2 = keys(47, 22, 11, 5)
  cipherText = KID_KRYPTO(plainText, public_key, public_key2)
  print(f"[Cifrado]    PlainText: {plainText} => CipherText: {cipherText}")
  plainText2 = DEC_KID_KRYPTO(cipherText, private_key, public_key2)
  print(f"[Descifrado] CipherText: {cipherText} => PlainText: {plainText2}")

  

if __name__ == "__main__":
	main()