# 2Sub

I found the best aproach was to use a Hash Table. While we iterate, and also insert elements in the data structure, we check if there already exists any X which satisifes one
of the 2 conditions (X - Y = M or Y - X = M). If it exists in the table, we print the indexes of the 2 integers.

Time Complexity: O(n). We obly make one traversal on the list containing n elements.
Space Complexity: O(n). We only use on hash table with maximum size n
