"""Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise."""

class Solution(object):
    def mapWord(self, word):
        word_map = {}
        for i in range(len(word)):
            if word[i] in word_map.keys():
                word_map[word[i]] += 1
            else:
                word_map[word[i]] = 1
        return word_map
        
    def closeStrings(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: bool
        """
        #if len diff, cannot be remapped
        if len(word1) != len(word2):
            return False
        #map for each word
        map1 = self.mapWord(word1)
        map2 = self.mapWord(word2)
        
        #if map len not same, letters cannot be rearranged
        if len(map1) != len(map2):
            return False
        for key in map1:
            if map1[key] not in map2.values():
                return False
        for key in map2:
            if map2[key] not in map1.values():
                return False
        for key in map1:
            if key not in map2:
                return False
        return True
        
        
   
        
        
