from flask import Flask, render_template
from flask import *
from flask_mysqldb import MySQL
from flask_cors import CORS

app = Flask(__name__)
app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = 'Biencaps@312'
app.config['MYSQL_DB'] = 'prog_app'
mysql = MySQL(app)
CORS(app)

@app.route('/')
def test():
	return "Connection Established"

@app.route('/getContentList/<language>',methods=['GET'])
def getContentList(language):
	querry="select title from {}".format(language)
	cur=mysql.connection.cursor()
	print(querry)
	cur.execute(querry)
	data1=cur.fetchall()
	print(data1)
	list1=[]
	for i in range(len(data1)):
		list1.append(data1[i][0])
	print(list1)
	#title={"title":data1}
	return (jsonify(list1))
@app.route('/getContent/<language>/<content>',methods=['GET'])
def getContent(language,content):
	
	#sql='select theory from %s  where title=%s';
	lang = "select theory from {}".format(language)
	
	temp=" where title='{}'".format(content)
	sql=lang+temp
	print(sql)
	cur = mysql.connection.cursor()
	#print(sql)	
	cur.execute(sql);
	data1=cur.fetchall()
	return jsonify(data1[0])

@app.route('/getContent/<language>/<content>/code',methods=['GET'])
def getCodeImage(language,content):
	
	#sql='select theory from %s  where title=%s';
	lang = "select code_img from {}".format(language)
	
	temp=" where title='{}'".format(content)
	sql=lang+temp
	print(sql)
	cur = mysql.connection.cursor()
	#print(sql)
	
	cur.execute(sql);
	data1=cur.fetchall()
	return jsonify(data1[0])
@app.route('/addContent', methods = ['POST'])
def postData():
    #print ('Request success : ', request.is_json)
    details= request.get_json(force=True)
    
    language = details['language']
    title = details['title']
    theory=details['theory']
    code_img=details['img_url']
    
    cur = mysql.connection.cursor()
    querry1="INSERT INTO {}".format(language)
    cur.execute(querry1+"(title, theory,code_img) VALUES (%s, %s,%s)", (title,theory,code_img))
    mysql.connection.commit()
    cur.close()
    return 'success'
if __name__ =='__main__':
	app.run()
