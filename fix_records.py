import os
import re

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()

    # Regex to find record declarations
    pattern = re.compile(r'record\s+(\w+)\s*\((.*?)\)\s*\{', re.DOTALL)
    
    def replacer(match):
        record_name = match.group(1)
        params_str = match.group(2)
        
        # Split params by comma
        params = [p.strip() for p in params_str.split(',')]
        
        unique_params = []
        for p in params:
            if not p:
                continue
            if p not in unique_params:
                unique_params.append(p)
                
        new_params_str = ", ".join(unique_params)
        return f"record {record_name}({new_params_str}) {{"

    new_content = pattern.sub(replacer, content)

    if new_content != content:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"Fixed {filepath}")

def main():
    src_dir = r"c:\Users\saita\Desktop\pastaland\src"
    for root, _, files in os.walk(src_dir):
        for file in files:
            if file.endswith('.java'):
                process_file(os.path.join(root, file))

if __name__ == '__main__':
    main()
