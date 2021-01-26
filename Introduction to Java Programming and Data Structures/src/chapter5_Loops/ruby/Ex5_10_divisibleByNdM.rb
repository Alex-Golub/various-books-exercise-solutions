FROM = 100
TO = 1_000
M = 3
N = 4
PER_LINE = 10

lcm = M.lcm(N)
new_from = FROM + lcm - FROM % lcm
count = 0
new_from.step(by: lcm, to: TO) do |num|
  print num
  count += 1
  if (count % PER_LINE).zero?
    puts
  else
    print ' '
  end
end
