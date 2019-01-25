def info(message) {
    echo "\033[1;33m[Info]    \033[0m ${message}"
}

def success(message) {
    echo "\033[1;32m[Success] \033[0m ${message}"
}

def error(message) {
    echo "\033[1;31m[Error]   \033[0m ${message}"
}