import unittest
import prog

class MyTest(unittest.TestCase):
    def test_read(self):
        self.assertEqual(prog.read(), "aaa") 

    def test_inc(self):
        self.assertGreater(prog.inc(5),5)

if __name__ == '__main__':
    unittest.main()
