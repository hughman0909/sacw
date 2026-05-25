results = []
show_numbers_result = 500
count = 1

# 1
def rand(seed):
    seed ^= seed << 7 & 0xffff
    seed ^= seed >> 9
    seed ^= seed << 8 & 0xffff
    return seed

# 2
while True:
    print(f"{count}: Enter the result. w if win, l if lose, f if finish")
    inp = input()
    if inp == 'w':
        results += inp
        count += 1
    elif inp == 'l':
        results += inp
        count += 1
    elif inp == 'f':
        break
    else:
        continue

# 3
nums = range(65536)
selected_nums = []

for result in results:
    for seed in nums:
        seed = rand(seed)
        if result == 'w':
            if seed % 37 < 18:
                selected_nums.append(seed)
        elif result == 'l':
            if not (seed % 37 < 18):
                selected_nums.append(seed)
    nums = selected_nums.copy()
    selected_nums = []

# 4
if len(nums) == 1:
    seed = nums[0]
    with open ("gamble_prediction.txt", 'w') as f:
        for i in range(show_numbers_result):
            seed = rand(seed)
            if seed % 37 < 18:
                f.write(f"{count}: win\n")
            else:
                f.write(f"{count}: lose\n")
            count += 1
        print("file has been successfully created")
else:
    print("no candidates found or not only one candidate")