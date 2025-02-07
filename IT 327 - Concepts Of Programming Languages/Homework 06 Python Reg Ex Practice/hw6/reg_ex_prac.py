# extract phone numbers from a file
# Adiboshi Shalom

import re

def check_phone_number(str1):
    '''
    determines whether a string is a valid phone number in the form xxx-xxxx or (xxx) xxx-xxxx
    '''
    # your code here
    pattern = re.compile(r"^\d{3}-\d{4}$|^\(\d{3}\)\s\d{3}-\d{4}$")
    if re.match(pattern, str1):
        return True
    else:
        return False

def save_phone_numbers(input_file, output_file):
    '''
    reads the input file and writes to the output file only the lines from the input file that contain exactly a phone number
    '''
    # your code here

    try:
         same = False
         with open(input_file, 'r') as file:
            for line in file:
                if not line.startswith(' '):
                    same = check_phone_number(line)
                else:
                    continue
                if same is True:
                    with open(output_file, 'a') as file2:
                        file2.write(line)
    except FileNotFoundError:
         print('This file was not found')
          

if __name__ == '__main__':
    save_phone_numbers('data.txt', 'output.txt')
