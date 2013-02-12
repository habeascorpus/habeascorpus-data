package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
FieldInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
FieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ReaderUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ReaderUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
gatherSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
IndexReader	TokenNameIdentifier
>	TokenNameGREATER
allSubReaders	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
subReaders	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getSequentialSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subReaders	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
allSubReaders	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
subReaders	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
gatherSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
allSubReaders	TokenNameIdentifier
,	TokenNameCOMMA
subReaders	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
Gather	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
IndexReader	TokenNameIdentifier
topReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Gather	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
topReader	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
run	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
topReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
run	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docBase	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
run	TokenNameIdentifier
(	TokenNameLPAREN
docBase	TokenNameIdentifier
,	TokenNameCOMMA
topReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
run	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
base	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
subReaders	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getSequentialSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subReaders	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
base	TokenNameIdentifier
+	TokenNamePLUS
reader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
newBase	TokenNameIdentifier
=	TokenNameEQUAL
base	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
subReaders	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
newBase	TokenNameIdentifier
=	TokenNameEQUAL
run	TokenNameIdentifier
(	TokenNameLPAREN
newBase	TokenNameIdentifier
,	TokenNameCOMMA
subReaders	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
newBase	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
base	TokenNameIdentifier
+	TokenNamePLUS
reader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
newBase	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
base	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
subIndex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docStarts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
docStarts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
lo	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
hi	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
hi	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
lo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
mid	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
lo	TokenNameIdentifier
+	TokenNamePLUS
hi	TokenNameIdentifier
)	TokenNameRPAREN
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
midValue	TokenNameIdentifier
=	TokenNameEQUAL
docStarts	TokenNameIdentifier
[	TokenNameLBRACKET
mid	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
<	TokenNameLESS
midValue	TokenNameIdentifier
)	TokenNameRPAREN
hi	TokenNameIdentifier
=	TokenNameEQUAL
mid	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
>	TokenNameGREATER
midValue	TokenNameIdentifier
)	TokenNameRPAREN
lo	TokenNameIdentifier
=	TokenNameEQUAL
mid	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
mid	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
<	TokenNameLESS
size	TokenNameIdentifier
&&	TokenNameAND_AND
docStarts	TokenNameIdentifier
[	TokenNameLBRACKET
mid	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
midValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mid	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
hi	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
getIndexedFields	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
fields	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
:	TokenNameCOLON
getMergedFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
isIndexed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fields	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
fields	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
FieldInfos	TokenNameIdentifier
getMergedFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
IndexReader	TokenNameIdentifier
>	TokenNameGREATER
subReaders	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
IndexReader	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ReaderUtil	TokenNameIdentifier
.	TokenNameDOT
gatherSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
subReaders	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
subReader	TokenNameIdentifier
:	TokenNameCOLON
subReaders	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fieldInfos	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
subReader	TokenNameIdentifier
.	TokenNameDOT
getFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE