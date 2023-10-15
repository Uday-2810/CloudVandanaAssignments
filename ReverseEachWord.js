// Function to reverse a single word
function reverseWord(word) {
    return word.split('').reverse().join('');
}
  
// Function to reverse every word in a sentence
function reverseSentenceWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(reverseWord);
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
  
const inputSentence = prompt('Enter a sentence:');
  
const reversed = reverseSentenceWords(inputSentence);
  
console.log('Reversed sentence: ' + reversed);
  