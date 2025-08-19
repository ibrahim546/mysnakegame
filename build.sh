rm -v ./bin/* -rf
# derleme
mkdir -p bin
javac -d bin $(find src -name "*.java")

echo "Derlendi."
