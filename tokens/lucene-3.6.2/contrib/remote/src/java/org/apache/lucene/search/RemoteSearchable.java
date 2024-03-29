package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
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
Document	TokenNameIdentifier
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
FieldSelector	TokenNameIdentifier
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
Term	TokenNameIdentifier
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
CorruptIndexException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
FSDirectory	TokenNameIdentifier
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
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
rmi	TokenNameIdentifier
.	TokenNameDOT
Naming	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
rmi	TokenNameIdentifier
.	TokenNameDOT
RMISecurityManager	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
rmi	TokenNameIdentifier
.	TokenNameDOT
RemoteException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
rmi	TokenNameIdentifier
.	TokenNameDOT
server	TokenNameIdentifier
.	TokenNameDOT
UnicastRemoteObject	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
RemoteSearchable	TokenNameIdentifier
extends	TokenNameextends
UnicastRemoteObject	TokenNameIdentifier
implements	TokenNameimplements
RMIRemoteSearchable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Searchable	TokenNameIdentifier
local	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RemoteSearchable	TokenNameIdentifier
(	TokenNameLPAREN
Searchable	TokenNameIdentifier
local	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
RemoteException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
local	TokenNameIdentifier
=	TokenNameEQUAL
local	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
Collector	TokenNameIdentifier
results	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
local	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
local	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
docFreq	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docFreqs	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
terms	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TopDocs	TokenNameIdentifier
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TopFieldDocs	TokenNameIdentifier
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
n	TokenNameIdentifier
,	TokenNameCOMMA
Sort	TokenNameIdentifier
sort	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
,	TokenNameCOMMA
sort	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
doc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
doc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
,	TokenNameCOMMA
FieldSelector	TokenNameIdentifier
fieldSelector	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
fieldSelector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Query	TokenNameIdentifier
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
original	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Explanation	TokenNameIdentifier
explain	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
local	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
args	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
indexName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
indexName	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Usage: org.apache.lucene.search.RemoteSearchable <index>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getSecurityManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setSecurityManager	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
RMISecurityManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Searchable	TokenNameIdentifier
local	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
indexName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RemoteSearchable	TokenNameIdentifier
impl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RemoteSearchable	TokenNameIdentifier
(	TokenNameLPAREN
local	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Naming	TokenNameIdentifier
.	TokenNameDOT
rebind	TokenNameIdentifier
(	TokenNameLPAREN
"//localhost/Searchable"	TokenNameStringLiteral
,	TokenNameCOMMA
impl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
