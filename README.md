# Find-in-sorted

You have a sorted array containing n - 1 unique number starting from 0 to n - 1 

## Installation


```bash
./gradlew clean package
```

## Usage

```python
./gradlew clean package
./gradlew clean test
```

## FindInSortedArray
A class which is used to find an object in a sorted array.

We use O(n) to loop through the array till a matching record is found (linear search)

We then use O(log n) to find mid value in the array and see if its in the 1 or second part (binary search)

## License
[MIT](https://choosealicense.com/licenses/mit/)
