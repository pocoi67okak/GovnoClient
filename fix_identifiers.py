import os
import re

def fix_identifiers(src_dir):
    pattern = re.compile(r'Identifier\.ofVanilla\((.*?)\)')
    for root, _, files in os.walk(src_dir):
        for file in files:
            if file.endswith('.java'):
                filepath = os.path.join(root, file)
                try:
                    with open(filepath, 'r', encoding='utf-8') as f:
                        content = f.read()
                    
                    new_content = pattern.sub(r'new Identifier(\1)', content)
                    
                    if new_content != content:
                        with open(filepath, 'w', encoding='utf-8') as f:
                            f.write(new_content)
                        print(f"Fixed identifiers in {filepath}")
                except Exception as e:
                    print(f"Error processing {filepath}: {e}")

src_dir = r"c:\Users\saita\Desktop\pastaland\src"
fix_identifiers(src_dir)
