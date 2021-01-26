require 'prime'

PER_LINE = 8
TO = 1_200
count = 0
Prime.each(TO) do |p|
  print format '%-6<prime>d', prime: p
  count += 1
  puts if (count % PER_LINE).zero?
end