with open("dog.png", 'r+b') as f:
    f.seek(0x00)
    f.write(b'\x89\x50\x4e\x47')
