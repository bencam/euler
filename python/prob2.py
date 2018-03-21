def even_fib(lim):
	x, y = 1, 2
	ans = 0
	while x < lim:
		if y % 2 == 0:
			ans += y
			# print(ans)
		x, y = y, x + y
	return ans

