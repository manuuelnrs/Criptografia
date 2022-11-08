'''
>	@author Juan Manuel Nava Rosales
>	@date 07/Noviembre/2022
>	@brief MD2 Algorithm - Cryptography - Practice Session 4
>	@version 1.0 
'''

# Proporciona una operación de sustitución de bytes no lineal "aleatoria"
PI_SUBST = [41, 46, 67, 201, 162, 216, 124, 1, 61, 54, 84, 161, 236, 240, 6,
19, 98, 167, 5, 243, 192, 199, 115, 140, 152, 147, 43, 217, 188,
76, 130, 202, 30, 155, 87, 60, 253, 212, 224, 22, 103, 66, 111, 24,
138, 23, 229, 18, 190, 78, 196, 214, 218, 158, 222, 73, 160, 251,
245, 142, 187, 47, 238, 122, 169, 104, 121, 145, 21, 178, 7, 63,
148, 194, 16, 137, 11, 34, 95, 33, 128, 127, 93, 154, 90, 144, 50,
39, 53, 62, 204, 231, 191, 247, 151, 3, 255, 25, 48, 179, 72, 165,
181, 209, 215, 94, 146, 42, 172, 86, 170, 198, 79, 184, 56, 210,
150, 164, 125, 182, 118, 252, 107, 226, 156, 116, 4, 241, 69, 157,
112, 89, 100, 113, 135, 32, 134, 91, 207, 101, 230, 45, 168, 2, 27,
96, 37, 173, 174, 176, 185, 246, 28, 70, 97, 105, 52, 64, 126, 15,
85, 71, 163, 35, 221, 81, 175, 58, 195, 92, 249, 206, 186, 197,
234, 38, 44, 83, 13, 110, 133, 40, 132, 9, 211, 223, 205, 244, 65,
129, 77, 82, 106, 220, 55, 200, 108, 193, 171, 250, 36, 225, 123,
8, 12, 189, 177, 74, 120, 136, 149, 139, 227, 99, 232, 109, 233,
203, 213, 254, 59, 0, 29, 57, 242, 239, 183, 14, 102, 88, 208, 228,
166, 119, 114, 248, 235, 117, 75, 10, 49, 68, 80, 180, 143, 237,
31, 26, 219, 153, 141, 51, 159, 17, 131, 20]

# Algoritmo Criptográfico Hash MD2
def MD2( text ):
  text = padding(text)   # Step 1
  text = checksum(text) # Step 2
  Hash = theHash(text)  # Step 3
  return Hash

def padding( text ):
  textORD = [ord(i) for i in text] # Character to Unicode
  paddeo = []                      # Padding Vector
  i = 16 - len(textORD) % 16       # 'i' Bytes múltiplo de 16
  for j in range(i):               # Padding
    paddeo.append(i)
  textORD += paddeo
  return textORD

def checksum( text ):
  C =[0] * 16
  L = 0
  for i in range(len(text) // 16):
    for j in range(16):
      c = text[ 16 * i + j]
      C[j] ^= PI_SUBST[ c ^ L]
      L = C[j]
  text += C
  return text

def theHash(text):
  X = [0] * 48
  for i in range(len(text) // 16):
    for j in range(16):
      X[ j + 16 ] = text[ 16 * i + j]
      X[ j + 32 ] = X[ j + 16 ] ^ X[j]
    t = 0
    for j in range(18):
      for k in range(48):
        t = X[ k ] ^ PI_SUBST[ t ]
        X[ k ] = t
      t = ( t + j ) % 256
  # The final hash is the first 16 byts of X
  _hash = X[:16]
  # Unicode to Character
  for i in range(len(_hash)):
    _hash[i] = hex(_hash[i])[2:].zfill(2) # Dec to Hex
  return "".join( _hash ) # Str to Int

##################      MAIN PROGRAM      ##################
def main():
  print("\tMD2 Algorithm - Practical Session 4 - 419048901")

  # Vector Test 1
  plainText = ""
  Hash = MD2(plainText)
  print("TEST_VECTOR(1)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 2
  plainText = "a"
  Hash = MD2(plainText)
  print("TEST_VECTOR(2)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 3
  plainText = "abc"
  Hash = MD2(plainText)
  print("TEST_VECTOR(3)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 4
  plainText = "message digest"
  Hash = MD2(plainText)
  print("TEST_VECTOR(4)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 5
  plainText = "abcdefghijklmnopqrstuvwxyz"
  Hash = MD2(plainText)
  print("TEST_VECTOR(5)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 6
  plainText = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
  Hash = MD2(plainText)
  print("TEST_VECTOR(6)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

  # Vector Test 7
  plainText = "12345678901234567890123456789012345678901234567890123456789012345678901234567890"
  Hash = MD2(plainText)
  print("TEST_VECTOR(7)")
  print(f"PlainText: {plainText} => Hash: {Hash}")

if __name__ == "__main__":
	main()