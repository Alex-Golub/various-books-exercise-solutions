def is_sorted_and_how(arr)
  is_asc = true
  is_desc = true
  (arr.length - 1).times do |i|
    if arr[i] > arr[i + 1]
      is_asc = false
    elsif arr[i] < arr[i + 1]
      is_desc = false
    end

    break if !is_asc && !is_desc
  end

  is_asc ? 'yes, ascending' : is_desc ? 'yes, descending' : 'no'
end