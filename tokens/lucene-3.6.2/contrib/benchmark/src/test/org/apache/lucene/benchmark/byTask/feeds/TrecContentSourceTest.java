package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
.	TokenNameDOT
TrecDocParser	TokenNameIdentifier
.	TokenNameDOT
ParsePathType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Config	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
DateTools	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
_TestUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TrecContentSourceTest	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
StringableTrecSource	TokenNameIdentifier
extends	TokenNameextends
TrecContentSource	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
docs	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
forever	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
docs	TokenNameIdentifier
=	TokenNameEQUAL
docs	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
forever	TokenNameIdentifier
=	TokenNameEQUAL
forever	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
openNextFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NoMoreDataException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
reader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
forever	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
++	TokenNamePLUS_PLUS
iteration	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
reader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
Config	TokenNameIdentifier
config	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
htmlParser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DemoHTMLParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expTitle	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expBody	TokenNameIdentifier
,	TokenNameCOMMA
Date	TokenNameIdentifier
expDate	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expName	TokenNameIdentifier
,	TokenNameCOMMA
dd	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expTitle	TokenNameIdentifier
,	TokenNameCOMMA
dd	TokenNameIdentifier
.	TokenNameDOT
getTitle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
.	TokenNameDOT
getBody	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
expBody	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Date	TokenNameIdentifier
date	TokenNameIdentifier
=	TokenNameEQUAL
dd	TokenNameIdentifier
.	TokenNameDOT
getDate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
DateTools	TokenNameIdentifier
.	TokenNameDOT
stringToDate	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
.	TokenNameDOT
getDate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expDate	TokenNameIdentifier
,	TokenNameCOMMA
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertNoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
StringableTrecSource	TokenNameIdentifier
stdm	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
thrown	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
stdm	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoMoreDataException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
thrown	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting NoMoreDataException"	TokenNameStringLiteral
,	TokenNameCOMMA
thrown	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testOneDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringableTrecSource	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testTwoDocuments	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-001</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2008 08:01:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-001 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-001 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringableTrecSource	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-001_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:01:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMissingDate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-001</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-001 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-001 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringableTrecSource	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-001_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:01:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBadDate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Bad Date "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringableTrecSource	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoMoreDataException	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testForever	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
docs	TokenNameIdentifier
=	TokenNameEQUAL
"<DOC> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral
+	TokenNamePLUS
"<DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral
+	TokenNamePLUS
"HTTP/1.1 200 OK "	TokenNameStringLiteral
+	TokenNamePLUS
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral
+	TokenNamePLUS
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Length: 614 "	TokenNameStringLiteral
+	TokenNamePLUS
"Connection: close "	TokenNameStringLiteral
+	TokenNamePLUS
"Content-Type: text/html "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOCHDR> "	TokenNameStringLiteral
+	TokenNamePLUS
"<html> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<head> "	TokenNameStringLiteral
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 title "	TokenNameStringLiteral
+	TokenNamePLUS
"</title> "	TokenNameStringLiteral
+	TokenNamePLUS
"</head> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"<body> "	TokenNameStringLiteral
+	TokenNamePLUS
"TEST-000 text "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</body> "	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
"</DOC>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringableTrecSource	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringableTrecSource	TokenNameIdentifier
(	TokenNameLPAREN
docs	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_0"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dd	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000_1"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testTrecFeedDirAllTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
dataDir	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
getTempDir	TokenNameIdentifier
(	TokenNameLPAREN
"trecFeedAllTypes"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
unzip	TokenNameIdentifier
(	TokenNameLPAREN
getDataFile	TokenNameIdentifier
(	TokenNameLPAREN
"trecdocs.zip"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
dataDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TrecContentSource	TokenNameIdentifier
tcs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TrecContentSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"print.props"	TokenNameStringLiteral
,	TokenNameCOMMA
"false"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"content.source.verbose"	TokenNameStringLiteral
,	TokenNameCOMMA
"false"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"content.source.excludeIteration"	TokenNameStringLiteral
,	TokenNameCOMMA
"true"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"doc.maker.forever"	TokenNameStringLiteral
,	TokenNameCOMMA
"false"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"docs.dir"	TokenNameStringLiteral
,	TokenNameCOMMA
dataDir	TokenNameIdentifier
.	TokenNameDOT
getCanonicalPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"trec.doc.parser"	TokenNameStringLiteral
,	TokenNameCOMMA
TrecParserByPath	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"content.source.forever"	TokenNameStringLiteral
,	TokenNameCOMMA
"false"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tcs	TokenNameIdentifier
.	TokenNameDOT
setConfig	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Config	TokenNameIdentifier
(	TokenNameLPAREN
props	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tcs	TokenNameIdentifier
.	TokenNameDOT
resetInputs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocData	TokenNameIdentifier
dd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
gotExpectedException	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
HashSet	TokenNameIdentifier
<	TokenNameLESS
ParsePathType	TokenNameIdentifier
>	TokenNameGREATER
unseenTypes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
ParsePathType	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
n	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
dd	TokenNameIdentifier
=	TokenNameEQUAL
tcs	TokenNameIdentifier
.	TokenNameDOT
getNextDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
n	TokenNameIdentifier
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"doc data "	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
" should not be null!"	TokenNameStringLiteral
,	TokenNameCOMMA
dd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unseenTypes	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
tcs	TokenNameIdentifier
.	TokenNameDOT
currPathType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
tcs	TokenNameIdentifier
.	TokenNameDOT
currPathType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
GOV2	TokenNameIdentifier
:	TokenNameCOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-000"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-000 text"	TokenNameStringLiteral
,	TokenNameCOMMA
tcs	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FBIS	TokenNameIdentifier
:	TokenNameCOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-001"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 Title"	TokenNameStringLiteral
,	TokenNameCOMMA
"TEST-001 text"	TokenNameStringLiteral
,	TokenNameCOMMA
tcs	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"1 January 1991"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FR94	TokenNameIdentifier
:	TokenNameCOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-002"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"DEPARTMENT OF SOMETHING"	TokenNameStringLiteral
,	TokenNameCOMMA
tcs	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"February 3, 1994"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FT	TokenNameIdentifier
:	TokenNameCOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-003"	TokenNameStringLiteral
,	TokenNameCOMMA
"Test-003 title"	TokenNameStringLiteral
,	TokenNameCOMMA
"Some pub text"	TokenNameStringLiteral
,	TokenNameCOMMA
tcs	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"980424"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
LATIMES	TokenNameIdentifier
:	TokenNameCOLON
assertDocData	TokenNameIdentifier
(	TokenNameLPAREN
dd	TokenNameIdentifier
,	TokenNameCOMMA
"TEST-004"	TokenNameStringLiteral
,	TokenNameCOMMA
"Test-004 Title"	TokenNameStringLiteral
,	TokenNameCOMMA
"Some paragraph"	TokenNameStringLiteral
,	TokenNameCOMMA
tcs	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
"January 17, 1997, Sunday"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Should never get here!"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoMoreDataException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
gotExpectedException	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Should have gotten NoMoreDataException!"	TokenNameStringLiteral
,	TokenNameCOMMA
gotExpectedException	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Wrong number of documents created by source!"	TokenNameStringLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Did not see all types!"	TokenNameStringLiteral
,	TokenNameCOMMA
unseenTypes	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
